package segurosTuPapa.seguro.repository.impl;

import org.springframework.stereotype.Repository;

import segurosTuPapa.seguro.model.Pqrs;
import segurosTuPapa.seguro.repository.PqrsRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class PqrsRepositoryImpl implements PqrsRepository {

    private final PqrsJpaRepository pqrsJpaRepository;

    public PqrsRepositoryImpl(PqrsJpaRepository pqrsJpaRepository) {
        this.pqrsJpaRepository = pqrsJpaRepository;
    }

    @Override
    public Pqrs save(Pqrs pqrs) {
        return pqrsJpaRepository.save(pqrs);
    }

    @Override
    public Optional<Pqrs> findById(Long id) {
        return pqrsJpaRepository.findById(id);
    }

    @Override
    public List<Pqrs> findAll() {
        return pqrsJpaRepository.findAll();
    }

    @Override
    public Pqrs update(Pqrs pqrs) {
        return pqrsJpaRepository.save