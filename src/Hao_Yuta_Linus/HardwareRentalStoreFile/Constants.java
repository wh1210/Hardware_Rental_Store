package Hao_Yuta_Linus.HardwareRentalStoreFile;

// Manage constant values in this program

public final class Constants {
    // Tool Type Names (Concrete Tool's Class name)
    public static final String CONCRETE = "Concrete";
    public static final String PAINTING = "Painting";
    public static final String PLUMBING = "Plumbing";
    public static final String WOODWORK = "Woodwork";
    public static final String YARDWORK = "Yardwork";

    // Concrete Tool Names
    public static final String[] TOOL_NAME = {
            "Pain1", "Pain2", "Pain3", "Pain4", "Pain5",
            "Conc1", "Conc2", "Conc3", "Conc4", "Conc5",
            "Plum1", "Plum2", "Plum3", "Plum4", "Plum5",
            "Wood1", "Wood2", "Wood3", "Wood4", "Wood5",
            "Yard1", "Yard2", "Yard3", "Yard4"};

    // Concrete Tool's Type
    public static final String[] TOOL_TYPE = {
            PAINTING, PAINTING, PAINTING, PAINTING, PAINTING,
            CONCRETE, CONCRETE, CONCRETE, CONCRETE, CONCRETE,
            PLUMBING, PLUMBING, PLUMBING, PLUMBING, PLUMBING,
            WOODWORK, WOODWORK, WOODWORK, WOODWORK, WOODWORK,
            YARDWORK, YARDWORK, YARDWORK, YARDWORK
    };

    // Customer Type Names
    public static final String BUSINESS = "Business";
    public static final String CASUAL = "Casual";
    public static final String REGULAR = "Regular";

    // Concrete Customer Names
    public static final String[] CUSTOMER_NAME = {
            "Business1", "Business2", "Business3", "Business4",
            "Casual1", "Casual2", "Casual3", "Casual4",
            "Regular1", "Regular2", "Regular3", "Regular4"
    };

    // Concrete Customer's Type
    public static final String[] CUSTOMER_TYPE = {
            BUSINESS, BUSINESS, BUSINESS, BUSINESS,
            CASUAL, CASUAL, CASUAL, CASUAL,
            REGULAR, REGULAR, REGULAR, REGULAR
    };

    public static final int NUM_TOOLS = 24;
    public static final int MAX_DAYS = 35;
    public static final int NUM_CUSTOMERS = 12;

    // A) Tool's rent fee per day
    public static final double PAINTING_PER_DAY = 10.00;
    public static final double CONCRETE_PER_DAY = 11.00;
    public static final double PLUMBING_PER_DAY = 12.00;
    public static final double WOODWORK_PER_DAY = 13.00;
    public static final double YARDWORK_PER_DAY = 14.00;


    // Option's fee is calculated by using A), B), and C)
    // EX: Painting tool's extension code fee is
    // EXTENSION_CODE_PRICE * PAINTING_OPTION_RATE


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
