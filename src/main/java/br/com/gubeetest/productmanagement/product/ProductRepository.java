package br.com.gubeetest.productmanagement.product;


import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Stack;

import static org.hibernate.loader.Loader.SELECT;
import static org.hibernate.sql.ast.Clause.FROM;
import static org.hibernate.sql.ast.Clause.WHERE;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByStack(String stack);

    List<Product> findAllByTargetMarket(String targetMarket);


    @Query(value = "SELECT DISTINCT stack FROM product_stack", nativeQuery = true)
    List<String> findAllStacksAvaliables();

    @Query(value = "SELECT DISTINCT target_market FROM product_target_market", nativeQuery = true)
    List<String> findAllTargetMarketAvaliables();

}




