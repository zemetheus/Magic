public enum CardStats
{
	CARDNAME("Card Name: "),
	MANACOST("Mana Cost: "),
	CONVERTEDMANACOST("Converted Mana Cost: "),
	CARDTYPE("Card Type: "),
	SUBTYPE("Subtype: "),
	CARDTEXT("Card Text: "),
	FLAVORTEXT("Flavor Text: "),
	POWER("Power: "),
	TOUGHNESS("Toughness: ");
	
	private final String label;
	
	CardStats(final String label)
	{
		this.label = label;
	}
	
	public String getLabel()
	{
		return label;
	}
}
