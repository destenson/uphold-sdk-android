package org.bitreserve.bitreserve_android_sdk.model.card;

/**
 * This class represents the model of a card request.
 */

public class CardRequest {

    private final String label;
    private final String currency;

    /**
     * Constructor.
     *
     * @param label The label of the card.
     * @param currency The currency of the card.
     */

    public CardRequest(String label, String currency) {
        this.label = label;
        this.currency = currency;
    }

    /**
     * Gets the label of the card.
     *
     * @return the label of the card
     */

    public String getLabel() {
        return label;
    }

    /**
     * Gets the currency of the card.
     *
     * @return the currency of the card
     */

    public String getCurrency() {
        return currency;
    }
}