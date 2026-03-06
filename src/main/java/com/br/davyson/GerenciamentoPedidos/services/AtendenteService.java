package com.br.davyson.GerenciamentoPedidos.services;

import com.br.davyson.GerenciamentoPedidos.dto.AtendenteRequestDTO;
import com.br.davyson.GerenciamentoPedidos.dto.PedidoResponseDTO;
import com.br.davyson.GerenciamentoPedidos.entitys.Atendente;
import com.br.davyson.GerenciamentoPedidos.exceptions.ObjectNotFoundException;
import com.br.davyson.GerenciamentoPedidos.repositorys.AtendenteRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AtendenteService {
    private final AtendenteRepository atendenteRepository;


    public AtendenteService(AtendenteRepository atendenteRepository) {
        this.atendenteRepository = atendenteRepository;
    }

    public List<Atendente> listAll(){
        return atendenteRepository.findAll();
    }

    public Atendente buscarPorNome(String name){
        return atendenteRepository.findByNomeIgnoreCase(name)
                .orElseThrow(() -> new ObjectNotFoundException("Atendente não encontrado."));
    }
    public Atendente findById(Long id){
        return atendenteRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Atendente não encontrado com Id "+ id));
    }
    public List<PedidoResponseDTO> listarPedidosDoAtendente(Atendente atendente){
        return atendente.getPedidos().stream().map(PedidoResponseDTO::new).toList();
    }
    @Transactional
    public Atendente saveAtendente(Atendente atendente){
        if (atendenteRepository.existsByNomeIgnoreCase(atendente.getNome())) {
            throw new DataIntegrityViolationException("Já existe um atendente com esse nome!");
        }
        return atendenteRepository.save(atendente);
    }

    @Transactional
    public Atendente updateAtendenteByName(String name, AtendenteRequestDTO dto) {
        Atendente atendenteExistente = buscarPorNome(name);

        if (dto.nome() != null) atendenteExistente.setNome(dto.nome());
        if (dto.senha() != null) atendenteExistente.setSenha(dto.senha());

        return atendenteRepository.save(atendenteExistente);
    }

    @Transactional
    public void deleteUser(String name) {
        Atendente atendente = buscarPorNome(name);
        atendenteRepository.delete(atendente);
    }
}
