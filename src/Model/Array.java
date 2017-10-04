package Model;

public class Array{
    private Vehicle[] items;
    private int total;

    public Array(){
        total = 0;
        this.items = new Vehicle[total];
    }

    public void add(Vehicle v) throws Exception
    {
        for (Vehicle vehicle : items)
        {
            if (v.equals(vehicle))
                throw new Exception("Vehicle not unique.");
        }

        Vehicle[] new_items = new Vehicle[items.length + 1];

        System.arraycopy(items, 0, new_items, 0, items.length);
        new_items[items.length] = v;

        items = new Vehicle[new_items.length];
        items = new_items;
        total++;
    }

    public int size() { return total; }
    public Vehicle[] getItems() { return items; }
}
