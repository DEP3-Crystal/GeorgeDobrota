public class first {




    public static void main(String[] args) {
        //exercise 1

        Incrementable a = new Incrementable();
        a.increment();
        System.out.println(Incrementable.i);
        Incrementable b = new Incrementable();
        b.increment();
        Incrementable c = new Incrementable();
        c.increment();
        System.out.println(Incrementable.i);

        //exercise 2

        charandint cai = new charandint();
        System.out.println(cai.z);
        System.out.println(cai.y);


        //exercise 3
        System.out.println("Input seconds: ");
        Hour hour = new Hour();
        System.out.println("H:M:S-> " + hour.p2 + ":" + hour.p3 + ":" + hour.p1);

        //exercise 4
        System.out.println("Introduce number: ");
        Cube cube = new Cube();
        System.out.println(" " + cube.c1 + " " + cube.c2 + " " + cube.c3);

        //exercise 5
        System.out.println("Swap numbers: ");
        Intvar intvar = new Intvar();
        System.out.println(intvar.intra());

        //exercise 6
        System.out.print("*********      ***        *          * \n");
        System.out.print("*       *    *     *     ***        * * \n");
        System.out.print("*       *   *       *   *****      *   * \n");
        System.out.print("*       *   *       *     *       *     * \n");
        System.out.print("*       *   *       *     *      *       * \n");
        System.out.print("*       *   *       *     *       *     * \n");
        System.out.print("*       *   *       *     *        *   * \n");
        System.out.print("*       *    *     *      *         * * \n");
        System.out.print("*********      ***        *          * \n");

        //exericse 7
        System.out.println("Intoduce three numbers: ");
        Statical statical = new Statical();
        System.out.println("First ecuation: " + statical.u);
        System.out.println("Second ecuation: " + statical.tt);
        System.out.println("Third ecuation: " + statical.t);

        //exercise 8
        System.out.println("Intoduce two numbers: ");
        Primenr primenr = new Primenr();
        System.out.println(primenr.primenr1());

        //exercise 9
        System.out.println("\nThe vampire numbers are: ");
        Vampire vampire = new Vampire();
        vampire.findVampire();
    }
}