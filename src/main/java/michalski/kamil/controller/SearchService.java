package michalski.kamil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
class SearchService {
    private Twitter twitter;
    @Autowired
    public SearchService(Twitter twitter) {
        this.twitter = twitter;
    }
    public List<Tweet> search(String searchType, List<String> keywords) {
        return null;
    }
}