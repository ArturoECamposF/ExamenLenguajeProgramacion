package crud;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class registrar {

	public static void main(String[] args) {
		SubjectDao dao = new SubjectDaoImpl();
		
		Subject subject = new Subject();
		subject.setSubject("EFRST IV");
		subject.setCreditos("3");
		
		dao.create(subject);
		
		List <Subject> subjectList = dao.findAll();
		
		for (Subject s:subjectList) {
			System.out.println(s.getId());
			System.out.println(s.getSubject());
			System.out.println(s.getCreditos());
		}
	}

}
