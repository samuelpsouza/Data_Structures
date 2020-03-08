typedef struct bag Bag;

void initBag (Bag *b);
void addBag (Bag *b, double val);
int containsBag (Bag * b, double val);
void removeBag (Bag * b, double val);
int sizeBag (Bag * b);