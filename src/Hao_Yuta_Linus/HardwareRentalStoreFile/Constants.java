package Hao_Yuta_Linus.HardwareRentalStoreFile;

// Manage constant values in this program

public final class Constants {
    // A) Tool's rent fee per day
    public static final double PAINTING_PER_DAY = 10.00;
    public static final double CONCRETE_PER_DAY = 11.00;
    public static final double PLUMBING_PER_DAY = 12.00;
    public static final double WOODWORK_PER_DAY = 13.00;
    public static final double YARDWORK_PER_DAY = 14.00;


    // Option's fee is calculated by using A), B), and C)
    // EX: Painting tool's extension code fee is
    // EXTENSION_CODE_PRICE + PAINTING_PER_DAY * PAINTING_OPTION_RATE


    // B) Category's rent rate
    public static final double PAINTING_OPTION_RATE = 0.1;
    public static final double CONCRETE_OPTION_RATE = 0.2;
    public static final double PLUMBING_OPTION_RATE = 0.3;
    public static final double WOODWORK_OPTION_RATE = 0.4;
    public static final double YARDWORK_OPTION_RATE = 0.5;

    // C) Option's base price
    public static final double EXTENSION_CODE_PRICE = 1.00;
    public static final double ACCESSORY_KIT_PRICE = 2.00;
    public static final double PROTECTIVE_GEAR_PACKAGE_PRICE = 3.00;

    // #tools by each customer
    public static final int MIN_NUM_TOOLS_BY_CASUAL = 1;
    public static final int MAX_NUM_TOOLS_BY_CASUAL = 2;
    public static final int NUM_TOOLS_BY_BUSINESS = 3;
    public static final int MIN_NUM_TOOLS_BY_REGULAR = 1;
    public static final int MAX_NUM_TOOLS_BY_REGULAR = 3;

    // #nights by each customer
    public static final int MIN_NUM_NIGHTS_BY_CASUAL = 1;
    public static final int MAX_NUM_NIGHTS_BY_CASUAL = 2;
    public static final int NUM_NIGHTS_BY_BUSINESS = 7;
    public static final int MIN_NUM_NIGHTS_BY_REGULAR = 3;
    public static final int MAX_NUM_NIGHTS_BY_REGULAR = 5;
}
