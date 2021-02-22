package Lukasz.HomeWork.Advanced.Zajecia15_Wzorce.Zadanie2;

public class Client {
    public static void main(String[] args) {

        Tree smallCherryTree = new CherryTree(15.5, 5.5, LeavesColor.GREEN, FruitType.CHERRY);
        Tree mediumCherryTree = smallCherryTree.clone()
                .setHeight(20.6)
                .setWidth(10.3);

        System.out.println("Small chery tree: " + smallCherryTree + "\n"
                            + "Medium cherry tree: " + mediumCherryTree + "\n");

        Tree smallMapleTree = new MapleTree(25.0, 12.0, LeavesColor.YELLOW, FruitType.CHESTNUT);
        Tree mediumMapleTree = smallMapleTree.clone()
                .setHeight(35.0)
                .setWidth(22.0);

        System.out.println("Small maple: " + smallMapleTree + "\n"
                            + "Medium maple: " + mediumMapleTree);
    }
}
