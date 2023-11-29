package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements DAO {
	// DB와 연결
	// DB와 실제 연결하는 구문

	// DB와 연결하는 역할
	private Connection conn;
	// SQL구문을 실행시키는 기능을 갖는 객체
	private PreparedStatement pst;
	// query문 저장
	private String query="";
	
	public ProductDAOImpl() {
		// DB 연결정보를 설정하는 class 싱글톤으로 생성
		DatabaseConnection dbc = DatabaseConnection.getInstance();
		conn = dbc.getConnection();
	}

	// SQL 구문 처리
	// executeQuery() / select 구문에서 사용 ResultSet이 리턴
	// executeUpdate() / insert, update, delete 별도의 리턴이 없고, 0 / 1로만 리턴
	@Override
	public int insert(Product p) {
		System.out.println("insert DAO Success!!");
		query = "insert into product(pname, price, madeby) values(?,?,?)";
		
		try {
			pst = conn.prepareStatement(query);
			// ?값 setting
			pst.setString(1, p.getPname());
			pst.setInt(2, p.getPrice());
			pst.setString(3, p.getMadeby());
			
			return pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("insert error!!");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Product> selectAll() {
		System.out.println("selectAll DAO Success!!");
		query = "select * from product order by pno";
		List<Product> list = new ArrayList<>();
		
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				int pno = rs.getInt("pno");
				// pno, pname, price
				list.add(new Product(pno,
						rs.getString("pname"),
						rs.getInt("price"),
						rs.getInt("readcount")
						));
			}
			return list;
			
		} catch (SQLException e) {
			System.out.println("selectAll error");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Product selectOne(int pno) {
		System.out.println("selectOne DAO Success!!");
		query = "select * from product where pno = ?";
		
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, pno);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				return new Product(
						rs.getInt("pno"), 
						rs.getString("pname"),
						rs.getInt("price"),
						rs.getString("regdate"),
						rs.getString("madeby"),
						rs.getInt("readcount")
						);
			}
		
		} catch (SQLException e) {
			System.out.println("selectOne error");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(Product p) {
		System.out.println("update DAO Success!!");
		query = "update product set pname=?, price=?, regdate=now(), madeby=? where pno=?";
		
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, p.getPname());
			pst.setInt(2, p.getPrice());
			pst.setString(3, p.getMadeby());
			pst.setInt(4, p.getPno());
			return pst.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("update error");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int pno) {
		System.out.println("delete DAO Success!!");
		query = "delete from product where pno=?";
		
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, pno);
			
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("delete error");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int readCountUpdate(int pno) {
		System.out.println("readCount DAO Success!!");
		query = "update product set readCount = readCount+1 where pno = ?";
		
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, pno);
			
			return pst.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("readCount error");
			e.printStackTrace();
		}
		return 0;
	}

}
