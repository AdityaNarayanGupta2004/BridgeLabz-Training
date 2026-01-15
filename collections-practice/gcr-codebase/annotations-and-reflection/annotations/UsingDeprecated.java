package annotationandreflection;

class LegacyAPI{
	@Deprecated
	void oldFeature() {
		System.out.println("Old feature");
	}
	void newfeature() {
		System.out.println("New Feature");
	}
}

public class UsingDeprecated {
	public static void main(String args[]) {
		LegacyAPI api = new LegacyAPI();
		api.oldFeature();
		api.newfeature();
	}
}
