# curl commands to create entity

    curl -i \
    -d '{"libraryEventId" : null, "libraryEventType" : "NEW", "book" : {"bookId" : null, "bookName" : "New book", "author" : "New author"}}' \
    -H "Content-Type: application/json" \
    -X POST http://localhost:8080/v1/library-event