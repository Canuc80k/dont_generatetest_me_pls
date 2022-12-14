package com.canuc80k.testcase;

public enum TestcaseFileNameType {
    NORMAL,
    LEXICOGRAPHICAL_ORDER;

    public static String getFileName(TestcaseFileNameType type, int currentTestcaseIndex, int lastTestcaseFileNameLength) {
        if (type == TestcaseFileNameType.NORMAL) return String.valueOf(currentTestcaseIndex);

        String filename = "";
        int currentLength = 1;
        if (currentTestcaseIndex != 0) currentLength = (int)(Math.log10(currentTestcaseIndex) + 1);
        int amount0prefix = lastTestcaseFileNameLength - currentLength;
        
        for (int i = 0; i < amount0prefix; i ++) filename += "0";
        filename += String.valueOf(currentTestcaseIndex);

        return filename;
    }
}
