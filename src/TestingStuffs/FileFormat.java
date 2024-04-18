package TestingStuffs;

public class FileFormat {

    /**
     * Constructs a document name using the given claim ID, card number, and document name,
     * and then validates it to ensure it follows the format "ClaimId_CardNumber_DocumentName.pdf".
     *
     * @param claimId The claim ID.
     * @param cardNumber The card number.
     * @param documentName The document name without the extension.
     * @return The constructed and validated document name.
     */
    public static String constructAndValidateDocumentName(String claimId, String cardNumber, String documentName) {
        // Construct the document name
        String formattedDocumentName = claimId + "_" + cardNumber + "_" + documentName + ".pdf";

        // Validate the document name
        if (isValidDocumentName(formattedDocumentName)) {
            return formattedDocumentName;
        } else {
            throw new IllegalArgumentException("Document name does not follow the expected format.");
        }
    }

    /**
     * Validates the document name against the expected format.
     *
     * @param documentName The document name to validate.
     * @return true if the document name is valid, false otherwise.
     */
    private static boolean isValidDocumentName(String documentName) {
        // Regex explanation:
        // ^f-\\d{10}_ : Starts with "f-" followed by 10 digits and an underscore
        // [\\w]+_ : Followed by one or more word characters (for the card number) and an underscore
        // .*\\.pdf$ : Ends with any characters (for the document name) and ".pdf"
        String regex = "^f\\d{10}_\\d{10}_.*\\.pdf$";
        return documentName.matches(regex);
    }

    public static void main(String[] args) {
        try {
            String claimId = "f1234567890";
            String cardNumber = "3336668889";
            String docName = "Purchase drugs";
            String formattedDocName = constructAndValidateDocumentName(claimId, cardNumber, docName);
            System.out.println("Formatted Document Name: " + formattedDocName);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
