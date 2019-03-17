package Tree;

public class ExpressionTreeMain {
	public static void main(String[] args) {
		
	ExpressionTree ETree = new ExpressionTree();
	
		char[] exp = {'1','2','+','7','*'};
		
		ExpressionTree.Node newNode = ETree.MakeExpTree(exp);

		/*printf("���� ǥ����� ����: ");
		ShowPrefixTypeExp(eTree); printf("\n");

		printf("���� ǥ����� ����: ");
		ShowInfixTypeExp(eTree); printf("\n");

		printf("���� ǥ����� ����: ");
		ShowPostfixTypeExp(eTree); printf("\n");*/
		System.out.println(ETree.EvaluateExpTree(newNode));
	
	}
}
