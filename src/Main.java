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

		model.allEqual(bs, cs.xor(cm).boolVar()).post();
		model.allEqual(bm, ds.not().and(dm.not()).or(ms.and(mm)).boolVar()).post();
		model.allEqual(cs, bs.xor(bm).or(ms.not().and(mm.not())).boolVar()).post();
		model.allEqual(cm, ds.and(dm).or(ls.and(lm)).boolVar()).post();
		model.allEqual(ds, bs.not().and(bm.not()).or(cs.and(cm)).boolVar()).post();
		model.allEqual(dm, ls.not().and(lm.not()).or(ms.not().and(mm.not())).boolVar()).post();
		model.allEqual(ls, bs.not().and(bm.not()).or(ds.not().and(dm.not())).boolVar()).post();
		model.allEqual(lm, cs.not().and(cm.not()).or(ms.not().and(mm.not())).boolVar()).post();
		model.allEqual(ms, bs.and(bm).or(ls.and(lm)).boolVar()).post();
		model.allEqual(mm, cs.xor(cm).or(ds.xor(dm)).boolVar()).post();

		Solution solution = model.getSolver().findSolution();
		if(solution != null)
		{
			System.out.println(solution.toString());
		}

	}
}