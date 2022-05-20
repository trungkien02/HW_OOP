package B2;

public class Vector {
    protected int n;
    protected double[] mang = new double[n];
    public Vector()
    {

    }
    public Vector(int n)
    {
        this.n = n;
    }
    public Vector(double[] mang, int n)
    {
        this.mang = mang;
        this.n = n;
    }

    public double dodai()
    {
        double x = 0;
        for(int i=0; i<n; i++)
        {
            x += mang[i] * mang [i];
        }
        return Math.sqrt(x);
    }

    public Vector cong(Vector x, Vector y, Vector z)
    {
        for(int i=0; i<n; i++)
        {
            z.mang[i] = x.mang[i] + y.mang[i];
        }
        return z;
    }

    public Vector tru(Vector x, Vector y, Vector z)
    {
        for(int i=0; i<n; i++)
        {
            z.mang[i] = x.mang[i] - y.mang[i];
        }
        return z;
    }

    public Vector nhan(Vector x, int m)
    {
        for(int i=0; i<n; i++)
        {
            x.mang[i] = x.mang[i] * m;
        }
        return x;
    }

    public Vector chia(Vector x, double m)
    {
        for(int i=0; i<n; i++)
        {
            x.mang[i] = x.mang[i] / m;
        }
        return x;
    }

    public Vector vtdonvi(Vector x)
    {
        return x.chia(x, x.dodai());
    }

    public String toString()
    {
        String s = "( ";
        for(int i=0; i<n; i++)
        {
            s += Double.toString(mang[i]) + " ";
        }
        s += ")";
        return s;
    }

    public void display()
    {
        System.out.print("Vector: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(mang[i] + " ");
        }
    }
}