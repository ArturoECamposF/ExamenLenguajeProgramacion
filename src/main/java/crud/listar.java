package crud;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class listar {

	public static void main(String[] args) {		
		SubjectDao dao = new SubjectDaoImpl();

		List <Subject> subjectList = dao.findAll();
		
		for (Subject s:subjectList) {
			System.out.println(s.getId());
			System.out.println(s.getSubject());
			System.out.println(s.getCreditos());
		}

	}

}
