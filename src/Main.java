import org.chocosolver.solver.Model;

public class Main 
{
	public static void main(final String[] args)
	{
		Model model = new Model("test model");
		System.out.println(model.toString());
	}
}