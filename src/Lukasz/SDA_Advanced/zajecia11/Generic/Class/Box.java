package Lukasz.SDA_Advanced.zajecia11.Generic.Class;

public class Box<T extends Item> {

    private T[] content;

    public Box(T ... content) {
        this.content = content;
    }

    public void showContent() {
        for (T contentPart: content) {
            System.out.println(contentPart.getDetails());
        }
    }

    public void changeContent(int index, T newContent) {
        content[index] = newContent;
    }

    public T getContent(int index) {
        return content[index];
    }
}
