package JDBC;

import java.util.List;

public class ProductServiceImpl implements Service {
	// ServiceImpl <=> DAO
	
	private DAO dao;	// interface로 생성 => DAOImpl로 구현
	
	public ProductServiceImpl() {
		dao = new ProductDAOImpl();	// 구현체 class로 생성
	}
	@Override
	public int register(Product p) {
		System.out.println("register_service success!!");
		// dao에 사용되는 메서드는 실제 DB에서 사용되는 명령어와 비슷하게 명령어 작성
		return dao.insert(p);
	}
	@Override
	public List<Product> list() {
		System.out.println("list_service success!!");
		return dao.selectAll();
	}
	@Override
	public Product detail(int pno) {
		System.out.println("detail_service success!!");
		// readcount 처리
		int isOk = dao.readCountUpdate(pno);
		return (isOk > 0) ? dao.selectOne(pno) : null;
	}
	@Override
	public int modify(Product p) {
		System.out.println("modify_service success!!");
		return dao.update(p);
	}
	@Override
	public int remove(int pno) {
		System.out.println("remove_service success!!");
		return dao.delete(pno);
	}

}
