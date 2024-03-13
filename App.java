public class App {
    public static void main(String[] args) throws Exception {     
        aluno larissa = new aluno("larissa","111.222.333-44",2921234,"13/03/2005","feminino");
        larissa.setNome("lariça");
        System.out.println(larissa.getNome());
        System.out.println(larissa.getRa());

        aluno a = new aluno();
        a.setNome("francisco");
        a.setRa(292135);
        System.out.println(a.getNome());


    }
}
