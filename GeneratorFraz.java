public class GeneratorFraz {
	public static void main(String[] args) {
		
		String[] worldListOne = {"круглосуточный", "трех-звенный", "3-х килограммовый", "взаимный", "обоюдный выигрыш",
		"проникающий", "умный", "динамичный"};

		String[] worldListTwo = {"уполномоченный", "трудный", "ориентированный", "центральный",
		"распределенный", "кластеризованный", "фирменный", "позиционированный", "сетевой"};

		String[] worldListThree = {"процесс", "талант", "подход", "портал", "обзор", "образец"};

		int oneLenght = worldListOne.length;
		int twoLenght = worldListTwo.length;
		int threeLenght = worldListThree.length;

		int rand1 = (int) (Math.random() * oneLenght);
		int rand2 = (int) (Math.random() * twoLenght);
		int rand3 = (int) (Math.random() * threeLenght);

		String fraza = worldListOne[rand1] + " " + worldListTwo[rand2] + " " + worldListThree[rand3];

		System.out.println("Все, что нам нужно - это " + fraza);

	}
}