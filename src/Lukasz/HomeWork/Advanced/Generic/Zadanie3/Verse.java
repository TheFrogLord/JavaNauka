package Lukasz.HomeWork.Advanced.Generic.Zadanie3;

public class Verse<T> {

    private final T data;
    private final T issues;
    private final T isSuccess;

    public Verse(T data, T issues, T isSuccess) {
        this.data = data;
        this.issues = issues;
        this.isSuccess = isSuccess;
    }

    public T getData() {
        return data;
    }

    public T getIssues() {
        return issues;
    }

    public T getIsSuccess() {
        return isSuccess;
    }

    public void variableType() {
        if (getData() instanceof String) {
            System.out.println(getIsSuccess());

        } else {
            System.out.println(getIssues());
        }
    }
}
