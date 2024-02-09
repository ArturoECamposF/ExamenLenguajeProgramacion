package crud;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class actualizar {

	public static void main(String[] args) {
		SubjectDao dao = new SubjectDaoImpl();
		
		Subject subject = new Subject();
		subject.setId(4);
		subject.setSubject("EFRST III");
		subject.setCreditos("5");
		
		dao.update(subject);
		
		List <Subject> subjectList = dao.findAll();
		
		for (Subject s:subjectList) {
			System.out.println(s.getId());
			System.out.println(s.getSubject());
			System.out.println(s.getCreditos());
		}

	}

}
