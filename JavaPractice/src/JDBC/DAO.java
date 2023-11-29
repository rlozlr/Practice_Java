package JDBC;

import java.util.List;

public interface DAO {

	int insert(Product p);

	List<Product> selectAll();

	Product selectOne(int pno);

	int update(Product p);

	int delete(int pno);

	int readCountUpdate(int pno);

}
