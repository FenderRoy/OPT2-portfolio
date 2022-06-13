package Datums;

import formats.IFormat;

public interface IDatum {

    int getDag();

    int getMaand();

    int getJaar();

    String toString(IFormat format);
}
