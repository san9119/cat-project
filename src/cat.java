class cat {
    String name;
    String owner_name;
    int age;
    cat()
    {
        name = "nameless";
        owner_name = "street";
        age = 1;
    }

    cat(String name, String owner_name, int age)
    {
        this.name = name;
        this.owner_name = owner_name;
        this.age = age;
    }

    void meu() {
        System.out.printf("Shoud be max points for this practice1-task MEUUUUUUUUUUU");
    }

    void eat() {
        System.out.printf("ultra tasty 5 points for this task AMMMMMMMMMMMMMMMMM");
    }

    void jump() {
        System.out.printf("climbing up to max rating in backend-development [STONKS SOUND]");
    }
    void getInfo() {
        System.out.printf("cat-name : %s \towner-name : %s \tage : %d\n", name, owner_name, age);
    }
}
