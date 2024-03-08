package org.example.bai2.repository;

import org.example.bai2.model.Computer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComputerRepository extends PagingAndSortingRepository<Computer, Long> {
}
