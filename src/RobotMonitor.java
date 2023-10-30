/*
    Student Name: Madina Lopez Lawani
    Student ID Number: u2088571
    Course: BSc Computer Science
    Module Code: CN6008
    Module Title: Advanced Topics in Computer Science
    Module Leader Name: Mike Kretsis
    Assesment Title: The RobotMonitor class
    Submission deadline date: 12/04/2022
*/



public class RobotMonitor

{
    // constant (ensure you have at least MAX)

    public static final int MAX = 6;
    public static final int MIN = 1;

    // attributes

    private int row;
    private int col;
    private Move Move;

    // invariant

    public boolean inv()

    {
        // code here

        return(Range(row) && Range(col)
                && (Move == Move.MOVELEFT || Move == Move.MOVERIGHT
                || Move == Move.MOVEUP || Move == Move.MOVEDOWN
                || Move == null));

    }

    // initialisation

    public RobotMonitor()
    {
        col = 1;
        row = 1;
        Move = null;

        if (!inv())
        {
            throw new VDMException("Sorry, the invariant is broken!");
        }
    }

    public boolean Range(int number)
    {
        if (MIN <= number && number <= MAX)
        {
            return true;
        }
        else
        {
            return false;
        }}

    //operations
    public int GetCol()
    {
        // code here
        return col;
    }

    public int GetRow()
    {
        // code here
        return row;
    }

    public Move GetMove()
    {
        // DO NOT MODIFY if you are sticking to the simple Robot model
        return null;
    }

    public void MoveRight()
    {
            /*
                CHECK precondtion
                IMPLEMENT postcondition
                CHECK invariant
            */
        if ((col >= MIN && col < MAX)
                && (row >= MIN && row <= MAX)
                && (Move != Move.MOVELEFT))
        {
            col = col + 1;
            Move = Move.MOVERIGHT;
        }
        else
        {
            throw new VDMException("The preconditon is broken");
        }

        if (!inv())
        {
            throw new VDMException("The invariant is broken");
        }
    }


    public void MoveLeft()
    {
        // code here

        if ((col >= MIN && col < MAX)
                && (row >= MIN && row <= MAX)
                &&(Move != Move.MOVERIGHT))
        {
            col = col - 1;
            Move = Move.MOVELEFT;
        }
        else
        {
            throw new VDMException("The preconditon is broken");
        }
        if(!inv())
        {
            throw new VDMException("The invariant is broken");
        }
    }


    public void MoveDown()
    {
        // code here

        if ((col >= MIN && col <= MAX)
                && (row >= MIN && row < MAX)
                &&(Move != Move.MOVEUP))
        {
            row = row + 1;
            Move = Move.MOVEDOWN;
        }
        else
        {
            throw new VDMException("The preconditon is broken");
        }
        if(!inv())
        {
            throw new VDMException("The invariant is broken");
        }
    }


    public void MoveUp()
    {
        // code here
        if ((col > MIN && col <= MAX)
                && (row > MIN && row < MAX)
                &&(Move != Move.MOVEDOWN))
        {
            row = row - 1;
            Move = Move.MOVEUP;
        }
        else
        {
            throw new VDMException("The preconditon is broken");
        }

        if (!inv())
        {
            throw new VDMException("The invariant is broken");
        }

    }

    public void Exit()
    {
        // code here
        if(row == 6 && col == 6)
        {
            System.out.println("Game is Up!");
            row = 1;
            col = 1;
        }
    }

    // toString method added
    public String toString()
    {
        // modify if you are using the text based tester
        return " ";
    }
}