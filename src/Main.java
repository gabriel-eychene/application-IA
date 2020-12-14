import org.chocosolver.solver.Model;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.Solution;

public class Main 
{
	public static void main(final String[] args)
	{
		Model model = new Model("Sel et Moutarde");

		BoolVar bs = model.boolVar("Bs");
		BoolVar bm = model.boolVar("Bm");
		BoolVar cs = model.boolVar("Cs");
		BoolVar cm = model.boolVar("Cm");
		BoolVar ds = model.boolVar("Ds");
		BoolVar dm = model.boolVar("Dm");
		BoolVar ls = model.boolVar("Ls");
		BoolVar lm = model.boolVar("Lm");
		BoolVar ms = model.boolVar("Ms");
		BoolVar mm = model.boolVar("Mm");

		model.allEqual(bs, bm, cs, cm, ds, dm, ls, lm, ms, mm).post();
		Solution solution = model.getSolver().findSolution();
		if(solution != null)
		{
			System.out.println(solution.toString());
		}

	}
}