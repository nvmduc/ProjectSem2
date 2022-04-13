package Insurance.DAO;

import java.util.List;

import Insurance.Entities.Evaluate;

public interface EvaluateDAO {
	public List<Evaluate> getAllEvaluate();

	public Evaluate getEvaluateById(Integer idEvaluate);

	public boolean insertEvaluate(Evaluate evaluate);

	public boolean updateEvaluate(Evaluate evaluate);

	public boolean deleteEvaluate(Integer idEvaluate);

	public List<Evaluate> searchEvaluateContent(String contentEvaluate);
}
