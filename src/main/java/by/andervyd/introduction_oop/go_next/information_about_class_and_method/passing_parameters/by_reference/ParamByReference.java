package by.andervyd.introduction_oop.go_next.information_about_class_and_method.passing_parameters.by_reference;

public class ParamByReference {
    int x;
    int y;

    public ParamByReference(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void callByRef(ParamByReference object) {
        object.x = object.x + this.x;
        object.y = object.y + this.y;
    }
}
