typedef struct point Point;

Point* create_point(float x, float y);
void free_point(Point* point);
void access_point(Point* point, float* x, float* y);
void assign_point(Point* point, float* x, float* y);
float distance_between_points(Point* point1, Point* point2);