package pavel.kavaliuk.domain;

public record LibraryEvent(
                Integer libraryEventId,
                LibraryEventType libraryEventType,
                Book book) {
}
