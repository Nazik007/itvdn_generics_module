package goit.hw5;

class Level {
    private int width;
    private int height;

    public Level(int width, int height) throws LevelTooBigException {
        if (width * height < 100000) {
            this.width = width;
            this.height = height;
        } else {
            throw new LevelTooBigException();
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

class LevelLoader {
    public void load(Level level) {
        System.out.println("Level loaded");
    }
}

class LevelTooBigException extends Exception {
    public LevelTooBigException () {
        super();
    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        //Level loaded
        try {
            new LevelLoader().load(new Level(10, 20));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new LevelLoader().load(new Level(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}