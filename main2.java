abstract class Furniture {
    // common functionality for all furniture products
}

class Chair extends Furniture {
    // implementation specific to chairs
}

class Sofa extends Furniture {
    // implementation specific to sofas
}

class CoffeeTable extends Furniture {
    // implementation specific to coffee tables
}

abstract class FurnitureFactory {
    public abstract Chair createChair();
    public abstract Sofa createSofa();
    public abstract CoffeeTable createCoffeeTable();
}

class ModernFurnitureFactory extends FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }
    
    public Sofa createSofa() {
        return new ModernSofa();
    }
    
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}

class VictorianFurnitureFactory extends FurnitureFactory {
    public Chair createChair() {
        return new VictorianChair();
    }
    
    public Sofa createSofa() {
        return new VictorianSofa();
    }
    
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}

class ArtDecoFurnitureFactory extends FurnitureFactory {
    public Chair createChair() {
        return new ArtDecoChair();
    }
    
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
    
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}

class FurnitureShop {
    private FurnitureFactory factory;
    
    public FurnitureShop(FurnitureFactory factory) {
        this.factory = factory;
    }
    
    public Chair orderChair() {
        return factory.createChair();
    }
    
    public Sofa orderSofa() {
        return factory.createSofa();
    }
    
    public CoffeeTable orderCoffeeTable() {
        return factory.createCoffeeTable();
    }
}

// Concrete implementations of Furniture classes for different variants (Modern, Victorian, ArtDeco)
class ModernChair extends Chair {
    // implementation specific to modern chairs
}

class ModernSofa extends Sofa {
    // implementation specific to modern sofas
}

class ModernCoffeeTable extends CoffeeTable {
    // implementation specific to modern coffee tables
}

class VictorianChair extends Chair {
    // implementation specific to victorian chairs
}

class VictorianSofa extends Sofa {
    // implementation specific to victorian sofas
}

class VictorianCoffeeTable extends CoffeeTable {
    // implementation specific to victorian coffee tables
}

class ArtDecoChair extends Chair {
    // implementation specific to art deco chairs
}

class ArtDecoSofa extends Sofa {
    // implementation specific to art deco sofas
}

class ArtDecoCoffeeTable extends CoffeeTable {
    // implementation specific to art deco coffee tables
}

class Main {
   public static void main(String[] args) {
    // create a furniture shop that sells modern furniture
    FurnitureFactory modernFactory = new ModernFurnitureFactory();
    FurnitureShop modernShop = new FurnitureShop(modernFactory);
    
    // order a chair, sofa, and coffee table from the modern shop
    Chair modernChair = modernShop.orderChair();
    Sofa modernSofa = modernShop.orderSofa();
    CoffeeTable modernCoffeeTable = modernShop.orderCoffeeTable();
    
    // print the details of the ordered furniture
    System.out.println("Ordered modern chair: " + modernChair);
    System.out.println("Ordered modern sofa: " + modernSofa);
    System.out.println("Ordered modern coffee table: " + modernCoffeeTable);
    
    // create a furniture shop that sells victorian furniture
    FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
    FurnitureShop victorianShop = new FurnitureShop(victorianFactory);
    
    // order a chair, sofa, and coffee table from the victorian shop
    Chair victorianChair = victorianShop.orderChair();
    Sofa victorianSofa = victorianShop.orderSofa();
    CoffeeTable victorianCoffeeTable = victorianShop.orderCoffeeTable();
    
    // print the details of the ordered furniture
    System.out.println("Ordered victorian chair: " + victorianChair);
    System.out.println("Ordered victorian sofa: " + victorianSofa);
    System.out.println("Ordered victorian coffee table: " + victorianCoffeeTable);
    
    // create a furniture shop that sells art deco furniture
    FurnitureFactory artDecoFactory = new ArtDecoFurnitureFactory();
    FurnitureShop artDecoShop = new FurnitureShop(artDecoFactory);
    
    // order a chair, sofa, and coffee table from the art deco shop
    Chair artDecoChair = artDecoShop.orderChair();
    Sofa artDecoSofa = artDecoShop.orderSofa();
    CoffeeTable artDecoCoffeeTable = artDecoShop.orderCoffeeTable();
    
    // print the details of the ordered furniture
    System.out.println("Ordered art deco chair: " + artDecoChair);
    System.out.println("Ordered art deco sofa: " + artDecoSofa);
    System.out.println("Ordered art deco coffee table: " + artDecoCoffeeTable);
}

}
