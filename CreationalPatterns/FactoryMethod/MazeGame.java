public abstract class MazeGame {
    public Maze createMaze() {
        Maze maze = makeMaze();
        Room room1 = makeRoom(1);
        Room room2 = makeRoom(2);
        Door door = makeDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Direction.NORTH, makeWall());
        room1.setSide(Direction.EAST, door);
        room1.setSide(Direction.SOUTH, makeWall());
        room1.setSide(Direction.WEST, makeWall());

        room2.setSide(Direction.NORTH, makeWall());
        room2.setSide(Direction.EAST, makeWall());
        room2.setSide(Direction.SOUTH, makeWall());
        room2.setSide(Direction.WEST, door);

        return maze;
    }

    protected abstract Maze makeMaze();
    protected abstract Room makeRoom(int n);
    protected abstract Wall makeWall();
    protected abstract Door makeDoor(Room r1, Room r2);
}

public class EnchantedMazeGame extends MazeGame {
    protected Maze makeMaze() { return new EnchantedMaze(); }
    protected Room makeRoom(int n) { return new EnchantedRoom(n, castSpell()); }
    protected Wall makeWall() { return new EnchantedWall(); }
    protected Door makeDoor(Room r1, Room r2) { return new DoorNeedingSpell(r1, r2); }

    private Spell castSpell() { return new Spell(); }
}