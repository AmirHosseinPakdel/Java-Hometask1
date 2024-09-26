public class Volume
{
    public static void main(String[] args)
    {
        double diameter_of_earth = 7600.0;
        double radius_of_earth = diameter_of_earth / 2.0;
        double volume_of_earth = (4.0 / 3.0) * Math.PI * Math.pow(radius_of_earth, 3);

        double diameter_of_sun = 865000.0;
        double radius_of_sun = diameter_of_sun / 2.0;
        double volume_of_sun = (4.0 / 3.0) * Math.PI * Math.pow(radius_of_sun, 3);

        double ratio = volume_of_earth / radius_of_earth;

        System.out.printf("The volume of the Earth is %.2f cubic miles,\n the volume of the sun is %.2f cubic miles,\n and the ratio of the volume of the Sun to the volume of the Earth is %.2f.%n", volume_of_earth, volume_of_sun, ratio);
    }
}