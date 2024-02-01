package Practice;
//boşluklara dikkat et
// printf
// println
// print
// \n
//bu 4ünü farklı farklı kullanarak 30 satır ekrana bastır,yaratıcı ol
//printf içerisinde, string, float , double, int, char bastırman gerekiyor. Formatlı halde; 3 sıfır, 1 sıfır
//iki sıfır noktayla ilişkili %.f
public class practice1 {
    public static void main(String[] args) {
        //
        String My_Name = " Besma";
        String My_Surname= " Bakirci";
        System.out.printf(" My Name is: %s\n My Surname is: %s\n", My_Name , My_Surname);
        System.out.println(" Pov : Could you spell your name please!\n");
        System.out.println(" Ok!");
        Character MyChar1 = 'B';
        Character MyChar2 = 'E';
        Character MyChar3 = 'S';
        Character MyChar4 = 'M';
        Character MyChar5 = 'A';
        System.out.printf(" %c\n %c\n %c\n %c\n %c\n", MyChar1 , MyChar2 , MyChar3 , MyChar4 , MyChar5 );
        System.out.println("   ˶ᵔ ᵕ ᵔ˶  ");
        System.out.println(" What subject did you search about recently?");
        int secund = 1;
        int minutes = 60 * secund;
        int Screen_time_on_Socaial_Media_USA = 134 * 60 *secund;
        int day = 1440 * minutes;
        int year = 365 * day;
        double Average_Years_of_Human_life = +70 * year;
        System.out.printf(" The Total Screen Time On Socaial Media USA: %d \n ",Screen_time_on_Socaial_Media_USA );
        System.out.printf(" The total is: %.2f \n ", Average_Years_of_Human_life);
        System.out.print(" Don't waste your life! \n");
        System.out.print(" Be careful that it's much time please invest it \n ");



    }

}
