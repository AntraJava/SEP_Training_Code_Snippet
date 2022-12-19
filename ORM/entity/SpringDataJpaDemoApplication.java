
@SpringBootApplication
public class SpringDataJpaDemoApplication implements CommandLineRunner {

    @Autowired
    EntityManager em;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaDemoApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
         Menu m = em.find(Menu.class, 1);
        System.out.println(m.getName());
       //  m.getDishes().forEach(System.out::println);
//        System.out.println(em.find(Ingredient.class, 5));
//        System.out.println(em.find(Dish.class, 4));
//        System.out.println(em.find(DishIngredientAssoc.class, 6));
    }
}
