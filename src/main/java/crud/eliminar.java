package crud;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class eliminar {

	public static void main(String[] args) {
		SubjectDao dao = new SubjectDaoImpl();
		
		Subject subject = dao.find(4);
				
		dao.delete(subject);
		
		List <Subject> subjectList = dao.findAll();
		
		for (Subject s:subjectList) {
			System.out.println(s.getId());
			System.out.println(s.getSubject());
			System.out.println(s.getCreditos());
		}

	}

}
