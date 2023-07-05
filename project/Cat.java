



public class Cat {

    // private недоступно никому
    // protected доступно внутри пакета + наследование
    // default доступно внутри пакета
    // public доступно всем

    private String name; // поле, содержащее имя кота
    private int appetite; // аппетит кота (столько он съедает за раз)
    private int hunger; // сытость (голодный или нет)

    public Cat(String name, int appetite, int hunger) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = hunger;
    }

    // getter
    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (hunger > 0 ) {
            hunger = plate.decreaseFood(appetite, hunger);
       
        }
    }

    @Override
    public String toString() {
        return name + " [" + appetite + "], " + "satiety?" + hunger;
    }
}

//     @Override
//     public boolean equals(Object obj) {
//         if (obj == null) {
//             return false;
//         } else if (obj instanceof Cat anotherCat) {
// //            Cat anotherCat = (Cat) obj; // cast
//             return name.equals(anotherCat.name);
//         }
//         return false;
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(name);
    // }

    // if obj1.equals(obj2) => obj1.hashcode() == obj2.hashcode()

    //    // setter
//    public void setName(String catName) {
//        name = catName;
//    }



