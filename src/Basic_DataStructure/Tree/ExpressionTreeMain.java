package Tree;

public class ExpressionTreeMain {
	public static void main(String[] args) {
		
	ExpressionTree ETree = new ExpressionTree();
	
		char[] exp = {'1','2','+','7','*'};
		
		ExpressionTree.Node newNode = ETree.MakeExpTree(exp);

		/*printf("전위 표기법의 수식: ");
		ShowPrefixTypeExp(eTree); printf("\n");

		printf("중위 표기법의 수식: ");
		ShowInfixTypeExp(eTree); printf("\n");

		printf("후위 표기법의 수식: ");
		ShowPostfixTypeExp(eTree); printf("\n");*/
		System.out.println(ETree.EvaluateExpTree(newNode));
	
	}
}
