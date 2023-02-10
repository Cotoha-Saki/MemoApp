package sana.programming.OthersClass;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "roomtime")

public class RoomDataBase {

    @PrimaryKey(autoGenerate = true)
    public int id;
    public int memo;
    public int todo;

    public RoomDataBase(int memo, int todo) {
        this.memo = memo;
        this.todo = todo;
    }
}
