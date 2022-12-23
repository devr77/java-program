class University {
    String uniName;

    void display() {
        System.out.println("University: " + uniName);
    }
}

class College extends University {
    String colName;
    String location;

    void display() {
        super.display();
        System.out.println("College: " + colName);
        System.out.println("Location: " + location);
    }
}

class Department extends College {
    String name;

    void display() {
        super.display();
        System.out.println("Name: " + name);
    }
}