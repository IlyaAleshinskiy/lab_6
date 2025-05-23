public class Attestation implements Visitor {
    @Override
    public void visit(Student student) {
        System.out.println("Студент проходит аттестацию по учебным дисциплинам");
    }

    @Override
    public void visit(Professor professor) {
        System.out.println("Профессор проходит аттестацию научных достижений");
    }

    @Override
    public void visit(Aspirant aspirant) {
        System.out.println("Аспирант отчитывается о ходе работы над диссертацией");
    }
}