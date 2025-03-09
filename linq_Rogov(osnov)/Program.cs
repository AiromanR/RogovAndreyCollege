using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
using System.Collections;

namespace rogovLinq
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //1
            List<string> list = new List<string>();
            Console.Write("Введите название файла: ");
            string path = Console.ReadLine();
            if (File.Exists(path))
            {
                var people = File.ReadAllLines(path)
                .Select(line => line.Split(' '))
                .Select(parts => new Person
                {
                    surname = parts[0],
                    name = parts[1],
                    patronimic = parts[2],
                    age = int.Parse(parts[3]),
                    weight = double.Parse(parts[4])
                }).ToList();
                var youngPeople = people.Where(p => p.age < 40);
                Console.WriteLine("Люди младше 40 лет:");
                foreach (var person in youngPeople)
                    Console.WriteLine(person);
            }
            else
                Console.WriteLine("Файла не существует");

            //2
            List<Department> departments = new List<Department>()
            {
                new Department { name = "Отдел закупок", reg = "Германия" },
                new Department { name = "Отдел продаж", reg = "Испания" },
                new Department { name = "Отдел маркетинга", reg = "Испания" }
            };

            List<Employ> employes = new List<Employ>()
            {
                new Employ { name = "Иванов", department = "Отдел закупок" },
                new Employ { name = "Петров", department = "Отдел закупок" },
                new Employ { name = "Сидоров", department = "Отдел продаж" },
                new Employ { name = "Лямин", department = "Отдел продаж" },
                new Employ { name = "Сидоренко", department = "Отдел маркетинга" },
                new Employ { name = "Кривоносов", department = "Отдел продаж" }
            };
            var groupedEmployees = employes.GroupBy(e => e.department)
                .Select(g => new { department = g.Key, Employees = g.Select(e => e.name) });
            Console.WriteLine("\nСгруппированный список сотрудников по отделам:");
            foreach (var group in groupedEmployees)
            {
                Console.WriteLine($"Отдел: {group.department}");
                foreach (var emp in group.Employees)
                    Console.WriteLine($"  - {emp}");
            }
            var employeesInRegionsStartingWithI = employes
                .Join(departments, e => e.department, d => d.name, (e, d) => new { e.name, d.reg })
                .Where(x => x.reg.StartsWith("И"));
            Console.WriteLine("\nСотрудники, регион которых начинается на «И»:");
            foreach (var emp in employeesInRegionsStartingWithI)
                Console.WriteLine($"{emp.name} - {emp.reg}");
            Console.ReadKey();
        }
    }
}
