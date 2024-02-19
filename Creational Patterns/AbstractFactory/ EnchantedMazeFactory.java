interface MazeFactory {
    Maze makeMaze();
    Wall makeWall();
    Room makeRoom(int n);
    Door makeDoor(Room r1, Room r2);
}
public class EnchantedMazeFactory implements MazeFactory {
    public Maze makeMaze() { return new EnchantedMaze(); }
    public Wall makeWall() { return new EnchantedWall(); }
    public Room makeRoom(int n) { return new EnchantedRoom(n, castSpell()); }
    public Door makeDoor(Room r1, Room r2) { return new DoorNeedingSpell(r1, r2); }

    private Spell castSpell() { return new Spell(); }
}