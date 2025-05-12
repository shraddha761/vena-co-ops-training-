package lambdasfunction.optionalandstreamapi.q49;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class URLValidator {
    public static Predicate<String> isValidUrl = urlStr -> {
        try {
            URL url = new URL(urlStr);
            String protocol = url.getProtocol();

            if (!protocol.equals("http") && !protocol.equals("https")) {
                return false;
            }
            return true;
        } catch (MalformedURLException e) {
            return false;
        }
    };

    public static List<String> getValidUrls(List<String> urls, Predicate<String> validator) {
        if (urls == null) return List.of();
        return urls.stream()
                .filter(validator)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> urls = List.of(
                "https://example.com",
                "http://invalid-url",
                "ftp://files.example.org",
                "not-a-url",
                "https://openai.com"
        );

        List<String> validUrls = getValidUrls(urls, isValidUrl);

        System.out.println("Valid URLs:");
        validUrls.forEach(System.out::println);
    }
}
